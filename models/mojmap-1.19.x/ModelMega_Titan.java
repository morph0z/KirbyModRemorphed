// Made with Blockbench 4.6.0
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class ModelMega_Titan<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "mega_titan"), "main");
	private final ModelPart bone;

	public ModelMega_Titan(ModelPart root) {
		this.bone = root.getChild("bone");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition bone = partdefinition.addOrReplaceChild("bone",
				CubeListBuilder.create().texOffs(52, 67)
						.addBox(-20.0F, -5.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(56, 21)
						.addBox(-23.0F, -5.0F, 1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(75, 57)
						.addBox(-22.0F, -4.0F, 4.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(75, 64)
						.addBox(-24.0F, -2.0F, 2.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(74, 42)
						.addBox(-25.0F, -5.0F, 5.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(76, 4)
						.addBox(-26.0F, -5.0F, 2.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(62, 21)
						.addBox(-24.0F, -4.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(40, 12)
						.addBox(-26.0F, -6.2F, -1.0F, 6.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(48, 26)
						.addBox(-20.0F, -6.0F, -1.0F, 4.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(0, 46)
						.addBox(-30.0F, -6.0F, -1.0F, 4.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(0, 55)
						.addBox(-30.0F, -12.0F, -1.0F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(54, 46)
						.addBox(-17.0F, -12.0F, -1.0F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(10, 65)
						.addBox(-17.0F, -18.0F, 0.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(10, 55)
						.addBox(-30.0F, -18.0F, 0.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(12, 72)
						.addBox(-30.0F, -16.0F, 2.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(40, 34)
						.addBox(-30.0F, -10.0F, 1.0F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(28, 34)
						.addBox(-17.0F, -10.0F, 1.0F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(6, 71)
						.addBox(-17.0F, -16.0F, 2.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(69, 75)
						.addBox(-17.0F, -11.0F, -1.0F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(65, 75)
						.addBox(-17.0F, -11.0F, 6.0F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(40, 39)
						.addBox(-18.0F, -11.0F, -2.0F, 1.0F, 5.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(14, 5)
						.addBox(-18.0F, -16.0F, -3.0F, 1.0F, 5.0F, 12.0F, new CubeDeformation(0.0F)).texOffs(26, 61)
						.addBox(-19.0F, -19.0F, 0.0F, 2.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(4, 61)
						.addBox(-18.0F, -17.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 61)
						.addBox(-18.0F, -17.0F, 6.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(60, 8)
						.addBox(-18.0F, -14.0F, -5.0F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(26, 56)
						.addBox(-18.0F, -14.0F, 9.0F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(74, 0)
						.addBox(-18.0F, -11.0F, 8.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(73, 60)
						.addBox(-18.0F, -11.0F, -4.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(60, 8)
						.addBox(-29.0F, -19.0F, 0.0F, 2.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(4, 55)
						.addBox(-29.0F, -17.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-29.0F, -16.0F, -3.0F, 1.0F, 5.0F, 12.0F, new CubeDeformation(0.0F)).texOffs(36, 56)
						.addBox(-29.0F, -17.0F, 6.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 55)
						.addBox(-29.0F, -14.0F, 9.0F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(48, 72)
						.addBox(-29.0F, -11.0F, 8.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(28, 34)
						.addBox(-29.0F, -11.0F, -2.0F, 1.0F, 5.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(72, 53)
						.addBox(-29.0F, -11.0F, -4.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(10, 55)
						.addBox(-29.0F, -14.0F, -5.0F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(57, 75)
						.addBox(-30.0F, -11.0F, 6.0F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(61, 75)
						.addBox(-30.0F, -11.0F, -1.0F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(22, 74)
						.addBox(-30.0F, -17.0F, 5.0F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(53, 75)
						.addBox(-30.0F, -17.0F, 0.0F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(36, 49)
						.addBox(-17.0F, -17.0F, 0.0F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(18, 74)
						.addBox(-17.0F, -17.0F, 5.0F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(37, 54)
						.addBox(-26.0F, -23.0F, 1.0F, 6.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(19, 50)
						.addBox(-26.0F, -24.0F, 0.0F, 6.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(4, 76)
						.addBox(-23.5F, -23.0F, 0.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(55, 69)
						.addBox(-26.0F, -24.0F, 5.0F, 6.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(51, 56)
						.addBox(-20.0F, -24.0F, 0.0F, 1.0F, 5.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(18, 56)
						.addBox(-28.25F, -28.5F, 2.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(42, 15)
						.addBox(-18.75F, -28.5F, 2.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(18, 56)
						.addBox(-27.0F, -24.0F, 0.0F, 1.0F, 5.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offset(23.0F, 24.0F, -3.0F));

		PartDefinition cube_r1 = bone.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(0, 6)
						.addBox(-13.0F, -9.5F, 4.0F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(0, 64)
						.addBox(-14.0F, -10.5F, 1.0F, 5.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(64, 28)
						.addBox(-14.0F, -10.5F, -2.0F, 5.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(0, 17)
						.addBox(-14.0F, -8.5F, -2.0F, 5.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(70, 4)
						.addBox(-15.0F, -8.9F, -1.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(26, 70)
						.addBox(-32.0F, -8.9F, -1.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(36, 62)
						.addBox(-37.0F, -8.5F, -2.0F, 5.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(62, 64)
						.addBox(-37.0F, -10.5F, -2.0F, 5.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(64, 21)
						.addBox(-37.0F, -10.5F, 1.0F, 5.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(14, 4)
						.addBox(-36.0F, -9.5F, 4.0F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r2 = bone.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(20, 68)
						.addBox(-15.0F, -18.9F, -7.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(14, 0)
						.addBox(-14.0F, -18.5F, -8.0F, 5.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(28, 12)
						.addBox(-14.0F, -20.5F, -8.0F, 5.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(59, 55)
						.addBox(-14.0F, -20.5F, -5.0F, 5.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-13.0F, -19.5F, -2.0F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(68, 17)
						.addBox(-37.0F, -18.5F, -8.0F, 5.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(39, 67)
						.addBox(-37.0F, -20.5F, -8.0F, 5.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(70, 33)
						.addBox(-32.0F, -18.9F, -7.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(64, 46)
						.addBox(-37.0F, -20.5F, -5.0F, 5.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(69, 69)
						.addBox(-36.0F, -19.5F, -2.0F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r3 = bone.addOrReplaceChild("cube_r3",
				CubeListBuilder.create().texOffs(70, 39).addBox(6.0F, -25.5F, -1.0F, 1.0F, 3.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-23.0F, 0.0F, 3.0F, 0.0F, 0.0F, -0.4363F));

		PartDefinition cube_r4 = bone.addOrReplaceChild("cube_r4",
				CubeListBuilder.create().texOffs(26, 22).addBox(-13.55F, -26.4F, -0.5F, 1.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-23.0F, 0.0F, 3.0F, 0.0F, 0.0F, 0.3054F));

		PartDefinition cube_r5 = bone.addOrReplaceChild("cube_r5",
				CubeListBuilder.create().texOffs(54, 21).addBox(12.55F, -26.5F, -0.5F, 1.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-23.0F, 0.0F, 3.0F, 0.0F, 0.0F, -0.3054F));

		PartDefinition cube_r6 = bone.addOrReplaceChild("cube_r6",
				CubeListBuilder.create().texOffs(0, 71).addBox(-7.0F, -25.5F, -1.0F, 1.0F, 3.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-23.0F, 0.0F, 3.0F, 0.0F, 0.0F, 0.4363F));

		PartDefinition cube_r7 = bone.addOrReplaceChild("cube_r7",
				CubeListBuilder.create().texOffs(32, 56).addBox(-3.5F, -23.0F, -3.0F, 1.0F, 4.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-23.0F, 0.0F, 3.0F, 0.0F, 0.0F, 0.1745F));

		PartDefinition cube_r8 = bone.addOrReplaceChild("cube_r8",
				CubeListBuilder.create().texOffs(0, 76).addBox(2.5F, -23.0F, -3.0F, 1.0F, 4.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-23.0F, 0.0F, 3.0F, 0.0F, 0.0F, -0.1745F));

		PartDefinition cube_r9 = bone.addOrReplaceChild("cube_r9",
				CubeListBuilder.create().texOffs(52, 35)
						.addBox(-4.0F, -12.0F, 16.0F, 8.0F, 10.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(28, 0)
						.addBox(-6.0F, -12.0F, 14.0F, 12.0F, 10.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-23.0F, 0.0F, 3.0F, -2.3562F, 0.0F, 3.1416F));

		PartDefinition cube_r10 = bone.addOrReplaceChild("cube_r10",
				CubeListBuilder.create().texOffs(56, 0)
						.addBox(-4.0F, -17.0F, 1.0F, 8.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 22)
						.addBox(-6.0F, -16.0F, -1.0F, 12.0F, 10.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-23.0F, 0.0F, 3.0F, 2.5307F, 0.0F, 3.1416F));

		PartDefinition cube_r11 = bone.addOrReplaceChild("cube_r11",
				CubeListBuilder.create().texOffs(28, 22).addBox(-6.0F, -12.0F, 14.0F, 12.0F, 10.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-23.0F, 0.0F, 3.0F, 0.7854F, 0.0F, 0.0F));

		PartDefinition cube_r12 = bone.addOrReplaceChild("cube_r12",
				CubeListBuilder.create().texOffs(0, 34).addBox(-6.0F, -16.0F, -1.0F, 12.0F, 10.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-23.0F, 0.0F, 3.0F, -0.6109F, 0.0F, 0.0F));

		PartDefinition cube_r13 = bone.addOrReplaceChild("cube_r13",
				CubeListBuilder.create().texOffs(41, 12)
						.addBox(13.0F, -2.0F, 15.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(40, 34)
						.addBox(12.0F, -1.0F, 19.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 46)
						.addBox(11.0F, -1.0F, 16.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(34, 34)
						.addBox(10.0F, 1.0F, 17.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(14, 10)
						.addBox(10.0F, -1.0F, 15.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(28, 34)
						.addBox(9.0F, -2.0F, 16.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(18, 67)
						.addBox(9.0F, -2.0F, 18.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(44, 41)
						.addBox(-10.0F, -2.0F, 15.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(40, 41)
						.addBox(-11.0F, -1.0F, 19.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(16, 46)
						.addBox(-12.0F, -1.0F, 16.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(32, 41)
						.addBox(-13.0F, 1.0F, 17.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(18, 10)
						.addBox(-13.0F, -1.0F, 15.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(28, 41)
						.addBox(-14.0F, -2.0F, 16.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(32, 70)
						.addBox(-14.0F, -2.0F, 18.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-23.0F, 0.0F, 3.0F, 1.3177F, 0.0F, 0.0F));

		PartDefinition cube_r14 = bone.addOrReplaceChild("cube_r14",
				CubeListBuilder.create().texOffs(53, 55)
						.addBox(-10.0F, 4.0F, 6.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(52, 46)
						.addBox(-11.0F, 5.0F, 10.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 50)
						.addBox(-12.0F, 5.0F, 7.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(46, 35)
						.addBox(-13.0F, 7.0F, 8.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(22, 10)
						.addBox(-13.0F, 5.0F, 6.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(24, 46)
						.addBox(-14.0F, 4.0F, 7.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(36, 72)
						.addBox(-14.0F, 4.0F, 9.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(64, 17)
						.addBox(12.0F, 5.0F, 10.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(60, 17)
						.addBox(13.0F, 4.0F, 6.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(26, 0)
						.addBox(10.0F, 5.0F, 6.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(16, 50)
						.addBox(11.0F, 5.0F, 7.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(56, 46)
						.addBox(9.0F, 4.0F, 7.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(42, 72)
						.addBox(9.0F, 4.0F, 9.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(56, 8)
						.addBox(10.0F, 7.0F, 8.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-23.0F, 0.0F, 3.0F, 1.885F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		bone.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}