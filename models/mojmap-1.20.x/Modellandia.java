// Made with Blockbench 4.8.3
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modellandia<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "landia"), "main");
	private final ModelPart head1;
	private final ModelPart head2;
	private final ModelPart body;
	private final ModelPart rightwing;
	private final ModelPart leftwing;
	private final ModelPart tail;
	private final ModelPart rightfoot;
	private final ModelPart leftfoot;
	private final ModelPart bb_main;

	public Modellandia(ModelPart root) {
		this.head1 = root.getChild("head1");
		this.head2 = root.getChild("head2");
		this.body = root.getChild("body");
		this.rightwing = root.getChild("rightwing");
		this.leftwing = root.getChild("leftwing");
		this.tail = root.getChild("tail");
		this.rightfoot = root.getChild("rightfoot");
		this.leftfoot = root.getChild("leftfoot");
		this.bb_main = root.getChild("bb_main");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition head1 = partdefinition.addOrReplaceChild("head1",
				CubeListBuilder.create().texOffs(23, 38)
						.addBox(-2.0F, -10.0F, -1.0F, 4.0F, 1.25F, 5.0F, new CubeDeformation(0.0F)).texOffs(50, 0)
						.addBox(-1.0F, -8.75F, -1.0F, 2.0F, 0.25F, 5.0F, new CubeDeformation(0.0F)).texOffs(53, 3)
						.addBox(-1.0F, -10.25F, -1.0F, 2.0F, 0.25F, 2.0F, new CubeDeformation(0.0F)).texOffs(36, 37)
						.addBox(-2.0F, -8.8F, 0.0F, 4.0F, 0.8F, 4.0F, new CubeDeformation(0.0F)).texOffs(38, 62)
						.addBox(-4.0F, -6.45F, 0.2F, 1.0F, 0.5F, 1.0F, new CubeDeformation(0.0F)).texOffs(23, 47)
						.addBox(-4.0F, -9.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(23, 61)
						.addBox(-4.0F, -9.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(23, 50)
						.addBox(-4.0F, -9.0F, -3.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(23, 49)
						.addBox(-1.0F, -12.0F, 0.0F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(58, 50)
						.addBox(-7.0F, -6.45F, 0.2F, 1.0F, 0.5F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 8)
						.addBox(-7.0F, -9.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 23)
						.addBox(-7.0F, -9.0F, -3.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(55, 60)
						.addBox(-7.0F, -9.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 22.0F, 0.0F));

		PartDefinition cube_r1 = head1.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(55, 57).addBox(-0.5F, -4.0F, 10.5F, 1.0F, 1.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-5.0F, 3.0F, -3.0F, 1.2217F, 0.0F, 0.0F));

		PartDefinition cube_r2 = head1.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(45, 59)
						.addBox(-2.0F, -10.0F, 7.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(56, 47)
						.addBox(-2.0F, -8.0F, 7.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(33, 60)
						.addBox(1.0F, -10.0F, 7.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-5.0F, 3.0F, -3.0F, 0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r3 = head1.addOrReplaceChild("cube_r3",
				CubeListBuilder.create().texOffs(55, 54).addBox(-0.5F, -2.0F, 11.25F, 1.0F, 1.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-5.0F, 3.0F, -3.0F, 1.2217F, 0.0F, 0.0F));

		PartDefinition cube_r4 = head1.addOrReplaceChild("cube_r4",
				CubeListBuilder.create().texOffs(51, 59).addBox(1.0F, -8.0F, 7.0F, 1.0F, 1.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-5.0F, 4.0F, -3.0F, 0.3491F, 0.0F, 0.0F));

		PartDefinition head2 = partdefinition.addOrReplaceChild("head2", CubeListBuilder.create().texOffs(16, 0)
				.addBox(-2.0F, -5.0F, -4.0F, 4.0F, 1.25F, 5.0F, new CubeDeformation(0.0F)).texOffs(40, 43)
				.addBox(-1.0F, -3.75F, -4.0F, 2.0F, 0.25F, 5.0F, new CubeDeformation(0.0F)).texOffs(44, 47)
				.addBox(-1.0F, -5.25F, -4.0F, 2.0F, 0.25F, 1.0F, new CubeDeformation(0.0F)).texOffs(36, 32)
				.addBox(-2.0F, -3.8F, -3.0F, 4.0F, 0.8F, 4.0F, new CubeDeformation(0.0F)).texOffs(49, 56).mirror()
				.addBox(1.0F, -4.45F, 0.2F, 1.0F, 0.5F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(40, 48)
				.addBox(-1.0F, -7.0F, -3.0F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(24, 27)
				.addBox(-2.0F, -4.45F, 0.2F, 1.0F, 0.5F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 57)
				.addBox(3.0F, -7.0F, -4.0F, 4.0F, 1.25F, 5.0F, new CubeDeformation(0.0F)).texOffs(4, 58)
				.addBox(4.0F, -5.75F, -4.0F, 2.0F, 0.25F, 5.0F, new CubeDeformation(0.0F)).texOffs(6, 60)
				.addBox(4.0F, -7.25F, -4.0F, 2.0F, 0.25F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 16)
				.addBox(3.0F, -5.75F, -3.0F, 4.0F, 0.75F, 4.0F, new CubeDeformation(0.0F)).texOffs(58, 50).mirror()
				.addBox(6.0F, -6.45F, 0.2F, 1.0F, 0.5F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(0, 8)
				.mirror().addBox(6.0F, -9.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(55, 60).mirror().addBox(6.0F, -9.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.mirror(false).texOffs(0, 23).mirror()
				.addBox(6.0F, -9.0F, -3.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(0, 8)
				.addBox(4.0F, -9.0F, -3.0F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(38, 62).mirror()
				.addBox(3.0F, -6.45F, 0.2F, 1.0F, 0.5F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(23, 47)
				.mirror().addBox(3.0F, -9.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(23, 50).mirror().addBox(3.0F, -9.0F, -3.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.mirror(false).texOffs(23, 61).mirror()
				.addBox(3.0F, -9.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(27, 58)
				.addBox(-2.0F, -9.45F, 3.2F, 1.0F, 0.5F, 1.0F, new CubeDeformation(0.0F)).texOffs(36, 26)
				.addBox(-2.0F, -7.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(33, 57)
				.addBox(-2.0F, -7.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(23, 38)
				.addBox(-2.0F, -7.0F, -3.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(27, 58).mirror()
				.addBox(1.0F, -9.45F, 3.2F, 1.0F, 0.5F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(36, 26)
				.mirror().addBox(1.0F, -7.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(23, 38).mirror().addBox(1.0F, -7.0F, -3.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.mirror(false).texOffs(33, 57).mirror()
				.addBox(1.0F, -7.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(23, 38)
				.mirror().addBox(1.0F, -7.0F, -3.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(33, 57).mirror().addBox(1.0F, -7.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.mirror(false).texOffs(36, 26).mirror()
				.addBox(1.0F, -7.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(33, 57)
				.addBox(-2.0F, -7.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(36, 26)
				.addBox(-2.0F, -7.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(23, 38)
				.addBox(-2.0F, -7.0F, -3.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(24, 27).mirror()
				.addBox(1.0F, -4.45F, 0.2F, 1.0F, 0.5F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(49, 56)
				.addBox(-2.0F, -4.45F, 0.2F, 1.0F, 0.5F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 57).mirror()
				.addBox(-7.0F, -7.0F, -4.0F, 4.0F, 1.25F, 5.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(6, 60)
				.mirror().addBox(-6.0F, -7.25F, -4.0F, 2.0F, 0.25F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(0, 16).mirror().addBox(-7.0F, -5.75F, -3.0F, 4.0F, 0.75F, 4.0F, new CubeDeformation(0.0F))
				.mirror(false).texOffs(0, 8).mirror()
				.addBox(-6.0F, -9.0F, -3.0F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(4, 58)
				.mirror().addBox(-6.0F, -5.75F, -4.0F, 2.0F, 0.25F, 5.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(23, 38).mirror().addBox(1.0F, -12.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.mirror(false).texOffs(36, 26).mirror()
				.addBox(1.0F, -12.0F, 3.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(33, 57)
				.mirror().addBox(1.0F, -12.0F, 1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(36, 26).addBox(-2.0F, -12.0F, 3.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(33, 57).addBox(-2.0F, -12.0F, 1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(23, 38).addBox(-2.0F, -12.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 22.0F, 0.0F));

		PartDefinition cube_r5 = head2.addOrReplaceChild("cube_r5",
				CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -3.0F, 11.0F, 1.0F, 1.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 1.223F, -0.0298F, -0.082F));

		PartDefinition cube_r6 = head2.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(54, 36)
				.addBox(-2.0F, -10.0F, 7.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(54, 36).mirror()
				.addBox(1.0F, -10.0F, 7.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(54, 40)
				.mirror().addBox(1.0F, -8.0F, 7.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(54, 40).addBox(-2.0F, -8.0F, 7.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r7 = head2.addOrReplaceChild("cube_r7",
				CubeListBuilder.create().texOffs(0, 0).mirror()
						.addBox(0.0F, -3.0F, 11.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 1.223F, 0.0298F, 0.082F));

		PartDefinition cube_r8 = head2.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(23, 55)
				.addBox(-2.0F, -8.0F, 7.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(29, 55)
				.addBox(-2.0F, -10.0F, 7.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(23, 26).mirror()
				.addBox(1.0F, -8.0F, 7.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(23, 26)
				.mirror().addBox(1.0F, -10.0F, 7.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(54, 40).mirror().addBox(1.0F, -8.0F, 7.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.mirror(false).texOffs(54, 40).addBox(-2.0F, -8.0F, 7.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(54, 36).addBox(-2.0F, -10.0F, 7.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(54, 36).mirror().addBox(1.0F, -10.0F, 7.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.mirror(false).texOffs(54, 36).mirror()
				.addBox(1.0F, -10.0F, 7.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(54, 40)
				.mirror().addBox(1.0F, -8.0F, 7.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(54, 36).addBox(-2.0F, -10.0F, 7.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(54, 40).addBox(-2.0F, -8.0F, 7.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(23, 26)
				.addBox(-2.0F, -10.0F, 7.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(23, 26)
				.addBox(-2.0F, -8.0F, 7.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(29, 55).mirror()
				.addBox(1.0F, -10.0F, 7.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(23, 55)
				.mirror().addBox(1.0F, -8.0F, 7.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 5.0F, -3.0F, 0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r9 = head2.addOrReplaceChild("cube_r9",
				CubeListBuilder.create().texOffs(0, 0)
						.addBox(-1.0F, -3.0F, 11.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-1.0F, -3.0F, 11.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 5.0F, -3.0F, 1.223F, -0.0298F, -0.082F));

		PartDefinition cube_r10 = head2.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(0, 0).mirror()
				.addBox(0.0F, -3.0F, 11.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(0, 0)
				.mirror().addBox(0.0F, -3.0F, 11.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 5.0F, -3.0F, 1.223F, 0.0298F, 0.082F));

		PartDefinition cube_r11 = head2.addOrReplaceChild("cube_r11",
				CubeListBuilder.create().texOffs(55, 54).mirror()
						.addBox(-0.5F, -2.0F, 11.25F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(5.0F, 3.0F, -3.0F, 1.2217F, 0.0F, 0.0F));

		PartDefinition cube_r12 = head2.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(33, 60).mirror()
				.addBox(-2.0F, -10.0F, 7.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(45, 59)
				.mirror().addBox(1.0F, -10.0F, 7.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(56, 47).mirror().addBox(1.0F, -8.0F, 7.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.mirror(false), PartPose.offsetAndRotation(5.0F, 3.0F, -3.0F, 0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r13 = head2.addOrReplaceChild("cube_r13",
				CubeListBuilder.create().texOffs(55, 57).mirror()
						.addBox(-0.5F, -4.0F, 10.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(5.0F, 3.0F, -3.0F, 1.2217F, 0.0F, 0.0F));

		PartDefinition cube_r14 = head2.addOrReplaceChild("cube_r14",
				CubeListBuilder.create().texOffs(51, 59).mirror()
						.addBox(-2.0F, -8.0F, 7.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(5.0F, 4.0F, -3.0F, 0.3491F, 0.0F, 0.0F));

		PartDefinition body = partdefinition.addOrReplaceChild("body",
				CubeListBuilder.create().texOffs(12, 14)
						.addBox(-3.0F, -7.0F, 1.0F, 8.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(21, 19)
						.addBox(-4.25F, -10.0F, 0.75F, 10.5F, 3.0F, 3.25F, new CubeDeformation(0.0F)).texOffs(0, 32)
						.addBox(-2.25F, -10.0F, 0.65F, 6.5F, 3.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-1.0F, 24.0F, 0.0F));

		PartDefinition rightwing = partdefinition.addOrReplaceChild("rightwing",
				CubeListBuilder.create().texOffs(33, 12).mirror()
						.addBox(-8.25F, -8.4F, 2.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(31, 1).mirror()
						.addBox(-8.25F, -8.3F, 1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 22.25F, 0.0F, 0.0F, 0.6109F, 0.0F));

		PartDefinition cube_r15 = rightwing.addOrReplaceChild("cube_r15",
				CubeListBuilder.create().texOffs(25, 28).mirror()
						.addBox(8.6F, -7.45F, -2.5F, 1.0F, 0.3F, 0.0F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(52, 15).mirror()
						.addBox(3.6F, -8.15F, -2.5F, 5.0F, 5.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -3.1416F, 0.0F, -3.1416F));

		PartDefinition cube_r16 = rightwing.addOrReplaceChild("cube_r16",
				CubeListBuilder.create().texOffs(49, 16).mirror()
						.addBox(9.6F, -8.15F, -2.5F, 1.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(47, 17).mirror()
						.addBox(6.6F, -7.15F, -2.5F, 3.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-2.0F, 0.0F, 0.0F, -3.1416F, 0.0F, -3.1416F));

		PartDefinition cube_r17 = rightwing.addOrReplaceChild("cube_r17",
				CubeListBuilder.create().texOffs(40, 14).mirror()
						.addBox(-13.65F, 0.0F, 2.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-2.0F, 0.1F, 0.0F, 0.0F, 0.0F, 0.7418F));

		PartDefinition cube_r18 = rightwing.addOrReplaceChild("cube_r18",
				CubeListBuilder.create().texOffs(24, 8).mirror()
						.addBox(-6.4F, -9.75F, 2.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-2.0F, 0.1F, 0.0F, 0.0F, 0.0F, -0.2618F));

		PartDefinition cube_r19 = rightwing.addOrReplaceChild("cube_r19",
				CubeListBuilder.create().texOffs(33, 9).mirror()
						.addBox(-7.25F, -7.4F, 2.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.1F, 0.0F, 0.0F, 0.0F, 0.1745F));

		PartDefinition leftwing = partdefinition.addOrReplaceChild("leftwing",
				CubeListBuilder.create().texOffs(33, 12)
						.addBox(5.25F, -8.4F, 2.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(31, 1)
						.addBox(7.25F, -8.3F, 1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 22.25F, 0.0F, 0.0F, -0.6109F, 0.0F));

		PartDefinition cube_r20 = leftwing.addOrReplaceChild("cube_r20",
				CubeListBuilder.create().texOffs(25, 28)
						.addBox(-9.6F, -7.45F, -2.5F, 1.0F, 0.3F, 0.0F, new CubeDeformation(0.0F)).texOffs(52, 15)
						.addBox(-8.6F, -8.15F, -2.5F, 5.0F, 5.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -3.1416F, 0.0F, 3.1416F));

		PartDefinition cube_r21 = leftwing.addOrReplaceChild("cube_r21",
				CubeListBuilder.create().texOffs(49, 16)
						.addBox(-10.6F, -8.15F, -2.5F, 1.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(47, 17)
						.addBox(-9.6F, -7.15F, -2.5F, 3.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.0F, 0.0F, 0.0F, -3.1416F, 0.0F, 3.1416F));

		PartDefinition cube_r22 = leftwing
				.addOrReplaceChild("cube_r22",
						CubeListBuilder.create().texOffs(40, 14).addBox(10.65F, 0.0F, 2.0F, 3.0F, 1.0F, 1.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(2.0F, 0.1F, 0.0F, 0.0F, 0.0F, -0.7418F));

		PartDefinition cube_r23 = leftwing
				.addOrReplaceChild("cube_r23",
						CubeListBuilder.create().texOffs(24, 8).addBox(3.4F, -9.75F, 2.0F, 3.0F, 1.0F, 1.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(2.0F, 0.1F, 0.0F, 0.0F, 0.0F, 0.2618F));

		PartDefinition cube_r24 = leftwing
				.addOrReplaceChild("cube_r24",
						CubeListBuilder.create().texOffs(33, 9).addBox(4.25F, -7.4F, 2.0F, 3.0F, 1.0F, 1.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.1F, 0.0F, 0.0F, 0.0F, -0.1745F));

		PartDefinition tail = partdefinition.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(33, 53).addBox(
				-1.0F, -3.0F, 3.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 22.0F, 0.0F));

		PartDefinition cube_r25 = tail.addOrReplaceChild("cube_r25",
				CubeListBuilder.create().texOffs(23, 29)
						.addBox(1.25F, -0.8F, 5.25F, 1.0F, 0.0F, 1.5F, new CubeDeformation(0.0F)).texOffs(2, 41)
						.addBox(2.25F, -0.8F, 4.5F, 3.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(0, 54)
						.addBox(2.25F, -1.3F, 5.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.75F, -0.25F, 0.0F, 0.0F, 0.0F, 0.3927F));

		PartDefinition cube_r26 = tail.addOrReplaceChild("cube_r26",
				CubeListBuilder.create().texOffs(25, 26).addBox(4.95F, 1.7F, 5.5F, 1.0F, 0.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.75F, -0.25F, 0.0F, 0.0F, 0.0F, -0.0873F));

		PartDefinition cube_r27 = tail.addOrReplaceChild("cube_r27",
				CubeListBuilder.create().texOffs(58, 30).addBox(0.25F, -2.0F, 5.5F, 2.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.75F, -0.25F, 0.0F, 0.0F, 0.0F, 0.6981F));

		PartDefinition cube_r28 = tail
				.addOrReplaceChild("cube_r28",
						CubeListBuilder.create().texOffs(48, 49).addBox(-1.0F, -2.5F, 4.25F, 2.0F, 1.0F, 2.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.1309F, 0.0F, 0.0F));

		PartDefinition rightfoot = partdefinition.addOrReplaceChild("rightfoot",
				CubeListBuilder.create().texOffs(48, 26)
						.addBox(-7.0F, -4.0F, 0.0F, 4.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(7, 0)
						.addBox(-7.0F, -2.0F, 0.0F, 1.0F, 1.25F, 1.0F, new CubeDeformation(0.0F)).texOffs(7, 0)
						.addBox(-5.5F, -2.0F, 0.0F, 1.0F, 1.25F, 1.0F, new CubeDeformation(0.0F)).texOffs(7, 0)
						.addBox(-4.0F, -2.0F, 0.0F, 1.0F, 1.25F, 1.0F, new CubeDeformation(0.0F)).texOffs(31, 50)
						.addBox(-7.0F, -2.0F, 1.0F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(39, 3).mirror()
						.addBox(-5.9F, -5.0F, 0.0F, 1.9F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(2.0F, 24.0F, -1.0F, -0.2618F, 0.0F, 0.0F));

		PartDefinition leftfoot = partdefinition.addOrReplaceChild("leftfoot", CubeListBuilder.create().texOffs(31, 50)
				.mirror().addBox(3.0F, -2.0F, 1.0F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(48, 26).mirror().addBox(3.0F, -4.0F, 0.0F, 4.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
				.mirror(false).texOffs(39, 3).addBox(4.0F, -5.0F, 0.0F, 1.9F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(7, 0).mirror().addBox(3.0F, -2.0F, 0.0F, 1.0F, 1.25F, 1.0F, new CubeDeformation(0.0F))
				.mirror(false).texOffs(7, 0).mirror()
				.addBox(4.5F, -2.0F, 0.0F, 1.0F, 1.25F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(7, 0)
				.mirror().addBox(6.0F, -2.0F, 0.0F, 1.0F, 1.25F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-2.0F, 24.0F, -1.0F, -0.2618F, 0.0F, 0.0F));

		PartDefinition bb_main = partdefinition.addOrReplaceChild("bb_main", CubeListBuilder.create().texOffs(9, 48)
				.addBox(-1.0F, -14.5F, 1.0F, 2.0F, 0.5F, 2.0F, new CubeDeformation(0.0F)).texOffs(4, 47)
				.addBox(-1.0F, -15.25F, 1.0F, 0.5F, 0.75F, 0.5F, new CubeDeformation(0.0F)).texOffs(3, 47)
				.addBox(0.5F, -15.25F, 2.5F, 0.5F, 0.75F, 0.5F, new CubeDeformation(0.0F)).texOffs(4, 47).mirror()
				.addBox(0.5F, -15.25F, 1.0F, 0.5F, 0.75F, 0.5F, new CubeDeformation(0.0F)).mirror(false).texOffs(3, 47)
				.mirror().addBox(-1.0F, -15.25F, 2.5F, 0.5F, 0.75F, 0.5F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		head1.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		head2.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		rightwing.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		leftwing.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		tail.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		rightfoot.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		leftfoot.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		bb_main.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		this.rightwing.yRot = (EndMathProcedure.sin(ageInTicks * 0.6F) * 0.6F);
		this.leftwing.yRot = (EndMathProcedure.sin(ageInTicks * 0.6F + 3) * 0.6F);
	}
}