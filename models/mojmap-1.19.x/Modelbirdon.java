// Made with Blockbench 4.6.5
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelbirdon<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "birdon"), "main");
	private final ModelPart bone;

	public Modelbirdon(ModelPart root) {
		this.bone = root.getChild("bone");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition bone = partdefinition.addOrReplaceChild("bone",
				CubeListBuilder.create().texOffs(0, 0)
						.addBox(-5.0F, -11.0F, -5.0F, 10.0F, 10.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(32, 20)
						.addBox(-2.0F, -5.0F, -7.0F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(30, 27)
						.addBox(-2.0F, -7.0F, -8.0F, 4.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(0, 4)
						.addBox(-4.5F, -10.0F, -6.0F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(1.5F, -10.0F, -6.0F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(18, 34)
						.addBox(-0.6F, -11.2F, -6.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r1 = bone.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(25, 5)
						.addBox(5.0F, -0.5F, -7.0F, 3.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(19, 21)
						.addBox(1.0F, -1.0F, -7.0F, 4.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.2182F, 0.0F));

		PartDefinition cube_r2 = bone.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(25, 0)
						.addBox(-8.0F, -0.5F, -7.0F, 3.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(0, 26)
						.addBox(-5.0F, -1.0F, -7.0F, 4.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.1745F, 0.0F));

		PartDefinition cube_r3 = bone.addOrReplaceChild("cube_r3",
				CubeListBuilder.create().texOffs(0, 20).addBox(-5.5F, 2.0F, -9.0F, 2.0F, 3.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -1.0908F, 0.0F, 0.5236F));

		PartDefinition cube_r4 = bone.addOrReplaceChild("cube_r4",
				CubeListBuilder.create().texOffs(0, 20).addBox(-4.6F, 6.9F, 9.0F, 9.0F, 0.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -1.2654F, 0.0F, 3.1416F));

		PartDefinition cube_r5 = bone
				.addOrReplaceChild("cube_r5",
						CubeListBuilder.create().texOffs(30, 32).addBox(-0.6F, 3.9F, -12.0F, 2.0F, 2.0F, 1.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -1.5708F, 0.0F, 0.0F));

		PartDefinition cube_r6 = bone
				.addOrReplaceChild("cube_r6",
						CubeListBuilder.create().texOffs(12, 32).addBox(-5.5F, -9.0F, -6.0F, 2.0F, 3.0F, 1.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5236F));

		PartDefinition cube_r7 = bone.addOrReplaceChild("cube_r7",
				CubeListBuilder.create().texOffs(0, 8)
						.addBox(-3.0F, -13.0F, -1.5F, 5.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(18, 27)
						.addBox(-3.0F, -11.0F, -2.0F, 5.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.7418F));

		PartDefinition cube_r8 = bone.addOrReplaceChild("cube_r8",
				CubeListBuilder.create().texOffs(32, 23)
						.addBox(-2.0F, -13.0F, -1.5F, 5.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(0, 32)
						.addBox(-2.0F, -11.0F, -2.0F, 5.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.7418F));

		return LayerDefinition.create(meshdefinition, 64, 64);
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